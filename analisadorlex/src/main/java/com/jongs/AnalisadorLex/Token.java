package com.jongs.AnalisadorLex;

public class Token {
   public String name;
   public String value;
   public Integer line;
   public Integer column;
   

    public Token(String name, String value, Integer line, Integer column) {
        this.name = name;
        this.value = value;
        this.line = line;
        this.column = column;
    }

    public Token() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getLine() {
        return this.line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public Integer getColumn() {
        return this.column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", value='" + getValue() + "'" +
            ", line='" + getLine() + "'" +
            ", column='" + getColumn() + "'" +
            "}";
    }
   
}
