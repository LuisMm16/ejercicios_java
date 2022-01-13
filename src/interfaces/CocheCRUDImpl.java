package interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Guarda el coche");
    }

    @Override
    public void findAll() {
        System.out.println("Encuentra los coches");
    }

    @Override
    public void delete() {
        System.out.println("Elimina el coche");
    }
}
