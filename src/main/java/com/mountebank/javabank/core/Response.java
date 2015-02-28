package com.mountebank.javabank.core;

import lombok.Getter;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Response {
    @Getter
    private List<Is> isList = newArrayList();

    public Response withIs(Is is) {
        isList.clear();
        addIs(is);
        return this;
    }

    public Response addIs(Is is) {
        isList.add(is);
        return this;
    }

    public Is getIs(int index) {
        return isList.get(index);
    }
}