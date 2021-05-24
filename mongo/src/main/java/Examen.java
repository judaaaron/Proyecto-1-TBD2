
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

/**
 *
 * @author Judá Aarón
 */
public class Examen {

    @BsonProperty(value = "_id")
    ObjectId id;
    int idExamen;
    int idClase;
    int cantPreguntas;

    public Examen() {
    }

    public Examen(int idExamen, int idClase, int cantPreguntas) {
        this.idExamen = idExamen;
        this.idClase = idClase;
        this.cantPreguntas = cantPreguntas;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getCantPreguntas() {
        return cantPreguntas;
    }

    public void setCantPreguntas(int cantPreguntas) {
        this.cantPreguntas = cantPreguntas;
    }

    @Override
    public String toString() {
        return "Examen{" + "id=" + id + ", idExamen=" + idExamen + ", idClase=" + idClase + ", cantPreguntas=" + cantPreguntas + '}';
    }

}
