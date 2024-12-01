package model;

public class Adocao {

    private long idAdocao;
    private Adotante adotante;
    private Tutor tutor;
    private Animal animal;


    public Adocao() {}
    public Adocao(long idAdocao, Adotante adotante, Tutor tutor, Animal animal) {
        this.idAdocao = idAdocao;
        this.adotante = adotante;
        this.tutor = tutor;
        this.animal = animal;
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Adocao{" +
                "idAdocao=" + idAdocao +
                ", adotante=" + adotante +
                ", tutor=" + tutor +
                ", animal=" + animal +
                '}';
    }
}
