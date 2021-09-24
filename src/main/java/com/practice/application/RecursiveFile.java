package com.practice.application;

import java.util.ArrayList;
import java.util.List;

class Dir{
    Dir dir;
    List<String> files;

    public Dir(Dir dir, List<String> files) {
        this.dir = dir;
        this.files = files;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "Dir{" +
                "dir=" + dir +
                ", files=" + files +
                '}';
    }
}
public class RecursiveFile {
    public static void main(String[] args) {
        List<Dir> directories = new ArrayList<>();
       List<String> files= new ArrayList<>();
       files.add("F7");
       files.add("F8");
       files.add("F9");

        Dir d5 = new Dir(null,files);
        files= new ArrayList<>();
        files.add("F6");
        files.add("F5");
        files.add("F4");

        Dir d4 = new Dir(d5,files);

        files= new ArrayList<>();
        files.add("F3");
        files.add("F2");
        files.add("F1");

        Dir d3 = new Dir(d4,files);
        directories.add(d3);
        directories.add(d4);
        directories.add(d5);
        directories.stream().forEach(dir -> {
            System.out.println(dir);


        });

    }
}
