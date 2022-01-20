package io.zoo.animal.lion.behavioral.strategy;

import io.zoo.animal.lion.behavioral.strategy.compile.CompileStrategy;
import io.zoo.animal.lion.behavioral.strategy.writecode.WriteCodeStrategy;

public abstract class Ide {

    private final String name;

    private WriteCodeStrategy writeCodeStrategy;

    private CompileStrategy compileStrategy;

    public Ide(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWriteCodeStrategy(WriteCodeStrategy writeCodeStrategy) {
        this.writeCodeStrategy = writeCodeStrategy;
    }

    public void setCompileStrategy(CompileStrategy compileStrategy) {
        this.compileStrategy = compileStrategy;
    }

    public void writeCode() {
        writeCodeStrategy.writeCode();
    }

    public void compile() {
        compileStrategy.compile();
    }

}
