package java_oop_homeWork.src.serialization;

import java.io.Serializable;
import java.util.Objects;

public interface Writeble {
    boolean write(Serializable serializable, String filePath);
    Object read(String filePath);
}