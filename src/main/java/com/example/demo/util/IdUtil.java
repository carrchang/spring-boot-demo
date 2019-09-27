package com.example.demo.util;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.NoArgGenerator;

public class IdUtil {

    public static final NoArgGenerator ID_GENERATOR = Generators.timeBasedGenerator();

}
