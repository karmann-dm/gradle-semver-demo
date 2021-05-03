package com.karmanno.semver.demo;

import java.util.Arrays;

public class AnotherOutput {
    public static void main(String[] args) {
        Arrays.stream(args)
                .forEach(arg -> System.out.println(arg.toUpperCase()));
        System.out.println("================");
    }
}
