package org.qainsights.ProtectedDemo;

class FamilyRecipe {
    protected void getRecipe() {
        System.out.println("getRecipe from " + FamilyRecipe.class.getSimpleName());
    }
}
