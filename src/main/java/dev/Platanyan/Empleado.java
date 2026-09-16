package dev.Platanyan;

public abstract class Empleado {
    protected String nombre;
    protected String idEmpleado;
    protected String telefono;
    protected boolean activo;
    protected double salarioBase;

    public Empleado(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase) {

        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre no puede estar vacio");

        if (idEmpleado == null || idEmpleado.isBlank())
            throw new IllegalArgumentException("El ID del Empleado no puede estar vacio");

        if (telefono == null || telefono.isBlank())
            throw new IllegalArgumentException("El numero de telefono no puede estar vacio");

        if (salarioBase < 0)
            throw new IllegalArgumentException("El salario base no puede ser menor a 0");

        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.telefono = telefono;
        this.activo = activo;
        this.salarioBase = salarioBase;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        if (nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        this.nombre = nombre;
    }

    public String getIdEmpleado(){
        return this.idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado){
        if (idEmpleado == null || idEmpleado.isBlank())
            throw new IllegalArgumentException("El ID del Empleado no puede estar vacio");
        this.idEmpleado = idEmpleado;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public boolean isActivo(){
        return this.activo;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        if (salarioBase < 0)
            throw new IllegalArgumentException("El salario base no puede ser menor a 0");
        this.salarioBase = salarioBase;
    }

    abstract double CalcularSalario();
    abstract String obtenerRol();

    public void activar(){
        this.activo = true;
    }
    public void desactivar(){
        this.activo = false;
    }
    public String mostrarInfo(){
        String info = "";
        info += "Nombre: " + this.nombre + "\n";
        info += "IdEmpleado: " + this.idEmpleado + "\n";
        info += "Telefono: " + this.telefono + "\n";
        info += "Rol: " + this.obtenerRol() + "\n";
        info += "Estado: " + this.activo + "\n";
        info += "Salario: " + this.CalcularSalario() + "\n";
        return info;
    }
    public void asignarTelefono(String telefono){
        if (telefono == null || telefono.isBlank())
            throw new IllegalArgumentException("El numero de telefono no puede estar vacio");
        this.telefono = telefono;
    }
}
