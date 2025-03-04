package com.example.demo3;

public class SinhVien {
    private Long id;
    private String name;
    private Integer age;
    private Double mark;

    public SinhVien( Long id, String name,Integer age,Double mark) {
        setAge(age);
        setMark(mark);
        setName(name);
        setId(id);

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age< 18){
            throw new IllegalArgumentException("Age must be between 18 to 18");
        }
        this.age = age;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        if (id == null ||id < 0){
            throw new IllegalArgumentException("Id cannot be null or negative");
        }
        this.id = id;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        if (mark < 0  || mark >10){

        }
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null|| name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }
}
