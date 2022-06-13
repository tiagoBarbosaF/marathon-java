package tiagobarbosa.marathonjava.javacore.Oexception.exception.test;

import tiagobarbosa.marathonjava.javacore.Oexception.exception.domain.Reader01;
import tiagobarbosa.marathonjava.javacore.Oexception.exception.domain.Reader02;

import java.io.*;

public class TryWithResourcesMain01 {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        try (Reader01 reader01 = new Reader01(); Reader02 reader02 = new Reader02();) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
