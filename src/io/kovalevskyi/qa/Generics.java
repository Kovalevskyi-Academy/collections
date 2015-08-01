package io.kovalevskyi.qa;

import org.omg.CORBA.INTERNAL;

import java.util.Objects;

public class Generics {

    public static void main(String[] args) {
        final Integer integer = 3;
        final Container integerContainer = new Container();
        integerContainer.setValue("hello");
        // TODO
        final Integer obj = (Integer)integerContainer.getValue();
    }

}

class Container {

    private Object obj;

    public void setValue(final Object obj) {
        this.obj = obj;
    }

    public Object getValue() {
        return this.obj;
    }

}
