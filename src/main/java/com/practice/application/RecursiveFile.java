package com.practice.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Dir {
    Dir dir;
    String name;
    List<String> files;

    public Dir(Dir dir, List<String> files, String name) {
        this.dir = dir;
        this.files = files;
        this.name = name;
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
        return "Name: " + name ;

    }
}

public class RecursiveFile {
    public static void main(String[] args) {
        List<Dir> directories = new ArrayList<>();
        List<String> files = new ArrayList<>();
        files.add("F7");
        files.add("F8");
        files.add("F9");

        Dir d5 = new Dir(null, files, "d5");
        files = new ArrayList<>();
        files.add("F6");
        files.add("F5");
        files.add("F4");

        Dir d4 = new Dir(d5, files, "d4");

        files = new ArrayList<>();
        files.add("F3");
        files.add("F2");
        files.add("F1");

        Dir d3 = new Dir(d4, files, "d3");
        directories.add(d3);
        directories.add(d4);
        directories.add(d5);


        System.out.println(printDirSubfile(d3, new ArrayList<>()));
    }

    static Map<Dir, List<String>> printDirSubfile(Dir dir, List<String> files) {
        if (dir == null) {
            return new HashMap<>();
        }
        Map<Dir, List<String>> reuslt = printDirSubfile(dir.getDir(), files);
        files.addAll(dir.getFiles());
        reuslt.put(dir, new ArrayList<>(files));
        return reuslt;
    }
}
