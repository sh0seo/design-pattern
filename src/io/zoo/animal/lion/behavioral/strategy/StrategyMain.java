package io.zoo.animal.lion.behavioral.strategy;

import io.zoo.animal.lion.behavioral.strategy.compile.CSharpCompileStrategy;
import io.zoo.animal.lion.behavioral.strategy.compile.JavaCompileStrategy;
import io.zoo.animal.lion.behavioral.strategy.writecode.DartWriteCodeStrategy;
import io.zoo.animal.lion.behavioral.strategy.writecode.JsWriteCodeStrategy;

public class StrategyMain {

    public static void main(String[] args) {
        Ide intellij = new Intellij("intellij");
        intellij.setWriteCodeStrategy(new DartWriteCodeStrategy());
        intellij.setCompileStrategy(new JavaCompileStrategy());

        intellij.writeCode();
        intellij.compile();

        intellij.setWriteCodeStrategy(new JsWriteCodeStrategy());
        intellij.writeCode();

        Ide visualStudio = new VisualStudio("visual studio");
        visualStudio.setWriteCodeStrategy(new JsWriteCodeStrategy());
        visualStudio.setCompileStrategy(new CSharpCompileStrategy());

        visualStudio.compile();
        visualStudio.writeCode();
    }

}
