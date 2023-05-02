package br.com.alura.estoque.Ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ContainerIoC {


    public Object getInstancia(Class<?> tipoFonte){
        Stream<Constructor<?>> construtores =
                Stream.of(tipoFonte.getDeclaredConstructors());

        Optional<Constructor<?>> constructorPadrao =
                construtores.filter(constructor -> constructor.getParameterCount() == 0 )
                        .findFirst();


        try {
            if (constructorPadrao.isPresent()){
                Object insancia = constructorPadrao.get().newInstance();
                return insancia;
            }else {
                Constructor<?> construtor = tipoFonte.getDeclaredConstructors()[0];

                List<Object> params = new ArrayList<>();
                for (Parameter param : construtor.getParameters()) {
                 Class<?> tipoDoParametro = param.getType();
                 params.add(getInstancia(tipoDoParametro));
                }
                return  construtor.newInstance(params.toArray());
            }


        } catch (InstantiationException | IllegalAccessException
                 | IllegalArgumentException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }



    }


    }


