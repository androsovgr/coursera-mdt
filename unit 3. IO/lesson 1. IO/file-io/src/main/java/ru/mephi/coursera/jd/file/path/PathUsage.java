package ru.mephi.coursera.jd.file.path;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.lang3.SystemUtils;

public class PathUsage {
    public static void main(String[] args) {
        Path path;
        if (SystemUtils.IS_OS_WINDOWS) {
            path = Paths.get("C:\\home\\joe\\foo");
        } else if (SystemUtils.IS_OS_LINUX) {
            path = Paths.get("/home/joe/foo");
        } else {
            throw new Error("OS is unsupported");
        }
        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());
    }
}
