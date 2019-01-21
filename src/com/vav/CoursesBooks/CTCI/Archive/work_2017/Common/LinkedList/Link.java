package com.vav.CoursesBooks.CTCI.Archive.work_2017.Common.LinkedList;

/**
 * Created by Vaibhav on 5/6/2017.
 */
public class Link<T> {
    private T data;
    private Link next;

    public Link(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
