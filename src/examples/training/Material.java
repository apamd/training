package examples.training;

public abstract class Material implements Interface_Assets{
    @Override
    public String getClassName() {
        return "Material";
    }
    @Override
    public int getClassCode() {
        return 0;
    }
}
