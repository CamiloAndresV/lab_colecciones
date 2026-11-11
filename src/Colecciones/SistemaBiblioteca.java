package Colecciones;

import java.util.*;

public class SistemaBiblioteca {
    private Map<String, Material> catalogo = new HashMap<>();
    private Map<String, List<String>> listaEspera = new HashMap<>();
    private Set<String> miembros = new HashSet<>();

    public void registrarMaterial(Material m) {
        catalogo.put(m.getCodigo(), m);
    }

    public Material buscarMaterial(String codigo) {
        return catalogo.get(codigo);
    }

    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catalogo está vacío");
            return;
        }
        for (Map.Entry<String, Material> entry : catalogo.entrySet()) {
            entry.getValue().mostrarInfo();
        }
    }

    public void agregarEspera(String codigoMaterial, String usuario) {
        if (!listaEspera.containsKey(codigoMaterial)) {
            listaEspera.put(codigoMaterial, new ArrayList<>());
        } else {
            listaEspera.get(codigoMaterial).add(usuario);
        }

    }

    public String siguienteEnEspera(String codigoMaterial) {
        List<String> espera = listaEspera.get(codigoMaterial);

        if (espera ==  null || espera.isEmpty()) {
            return null;
        }
        return espera.remove(0);
    }

    public boolean registrarMiembro(String usuario) {
        return miembros.add(usuario);
    }

    public boolean tieneMembresia(String usuario) {
        return miembros.contains(usuario);
    }
}
