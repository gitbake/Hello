package com.simple.hello.HelloDemo.mappers;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface HelloTextMapper {
    @Select("select text from hellotext")
    public String getHelloText();

    @Update("update hellotext SET text=#{t} where id=1")
    void updateHelloText(String t);
}
