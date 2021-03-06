package br.com.aaribeiro.whatsapp.model;

import com.google.firebase.database.DatabaseReference;

import java.io.Serializable;
import java.util.List;

import br.com.aaribeiro.whatsapp.config.ConfiguracaoFirebase;

public class Grupo implements Serializable {

    private String id;
    private String nome;
    private String foto;
    private List<Usuario> membros;

    public Grupo() {
        DatabaseReference noGrupos = ConfiguracaoFirebase.getFirebaseDatabase().child("noGrupos");
        String idGrupoFirebase = noGrupos.push().getKey();
        setId(idGrupoFirebase);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Usuario> getMembros() {
        return membros;
    }

    public void setMembros(List<Usuario> membros) {
        this.membros = membros;
    }
}
