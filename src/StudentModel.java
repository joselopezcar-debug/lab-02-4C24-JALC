public class StudentModel {
    // Atributos privados
    private int id;
    private String nombre;
    private String email;

    // Constructor vacío
    public StudentModel() {
    }

    // Constructor con parámetros
    public StudentModel(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    // Métodos Getter y Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Opcional: método toString para visualizar el objeto
    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}