public class Fila<String> {
    private No<String> refEntrada;

    public Fila() {
        this.refEntrada = null;
    }

    public void enqueue(String obj) {
        No<String> novoNo = new No<>(obj);
        novoNo.setRefNo(refEntrada);
        refEntrada = novoNo;
    }

    @Override
    public java.lang.String toString() {
        StringBuilder s = new StringBuilder();
        No<String> aux = this.refEntrada;
        if(this.refEntrada != null) {
            while(true) {
                s.append("[ No { objeto = ").append(aux.getObject()).append(" } ]");

                if(aux.getRefNo() != null) {
                    aux = aux.getRefNo();
                } else {
                    s.append("null");
                    break;
                }
            }
        } else {
            s = new StringBuilder("null");
        }

        return s.toString();
    }

    public String first() {
        if(!this.isEmpty()) {
            No<String> aux = this.refEntrada;
            while(true) {
                if(aux.getRefNo() != null) {
                    aux = aux.getRefNo();
                } else {
                    break;
                }
            }
            return aux.getObject();
        }
        return null;
    }

    public String dequeue() {
        if(!this.isEmpty()) {
            No<String> aux = this.refEntrada;
            No<String> NoAuxiliar = this.refEntrada;
            while(true) {
                if(aux.getRefNo() != null) {
                    NoAuxiliar = aux;
                    aux = aux.getRefNo();
                } else {
                    NoAuxiliar.setRefNo(null);
                    break;
                }
            }
            return aux.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return this.refEntrada == null;
    }
}
