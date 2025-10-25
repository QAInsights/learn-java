package org.qainsights.innerclassdemo;

public class InnerClassDemoDriver {

    public static void main(String[] args) {

        OuterClass o = new OuterClass("Outer Name");
        OuterClass.InnerClass inn = o.new InnerClass("Inner Name");
        
        System.out.println(o.getName());

        System.out.println(inn.getInnerName());
        
        
    }
 
     
}

class OuterClass {
    private String name;

    OuterClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    class InnerClass {
        private String inner;

 
        // Constructor that accepts a String
        InnerClass(String inner) {
            this.inner = inner;
        }

        void setInnerName(String name) {
            this.inner = name;
        }
        
        void go(){
            System.out.println(inner + name);
        }

        public String getInnerName() {
            return inner + name;
        }
    }
}
