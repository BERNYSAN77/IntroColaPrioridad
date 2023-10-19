public class Main {
    public static void main(String[] args) {
        ColaPrioridad cola = new ColaPrioridad();
        cola.encolar(3);
        cola.encolar(14);
        cola.encolar(12);
        cola.encolar(7);
        cola.encolar(10);
        cola.encolar(1);
        cola.encolar(6);
        cola.encolar(-8);
        cola.encolar(9);
        cola.encolar(5);
        cola.enlistar();
        System.out.println("cola ordenada");
        cola.enlistarOrdenada();
        System.out.println("eliminar");
        cola.sacarTodos();

    }
}