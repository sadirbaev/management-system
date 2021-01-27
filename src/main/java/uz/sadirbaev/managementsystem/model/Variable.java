package uz.sadirbaev.managementsystem.model;

public class Variable {
    String processVarName;
    Double lsl;
    Double usl;
    Double transformValue;

    public Variable() {
    }

    public Variable(String processVarName, Double lsl, Double usl, Double transformValue) {
        this.processVarName = processVarName;
        this.lsl = lsl;
        this.usl = usl;
        this.transformValue = transformValue;
    }

    public String getProcessVarName() {
        return processVarName;
    }

    public void setProcessVarName(String processVarName) {
        this.processVarName = processVarName;
    }

    public Double getLsl() {
        return lsl;
    }

    public void setLsl(Double lsl) {
        this.lsl = lsl;
    }

    public Double getUsl() {
        return usl;
    }

    public void setUsl(Double usl) {
        this.usl = usl;
    }

    public Double getTransformValue() {
        return transformValue;
    }

    public void setTransformValue(Double transformValue) {
        this.transformValue = transformValue;
    }
}
