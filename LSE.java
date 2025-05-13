package listaSimplesmenteEncadeada;

public class EmptyLinkedList extends RuntimeException {
    public EmptyLinkedList() {
        super("A lista está vazia!");
    }
}



package listaSimplesmenteEncadeada;

public class SLinkedList {
    private Node head;  
    private Node tail;  
    private int tamanho;   

    public SLinkedList() {
        head = null;
        tail = null;
        tamanho = 0;
    }

    public void addHead(String valor) {
        Node novo = new Node(valor, head);
        head = novo;
        if (tail == null) {
            tail = novo;
        }
        tamanho++;
    }

    public void addTail(String valor) {
        Node novo = new Node(valor, null);
        if (head == null) {
            head = tail = novo;
        } else {
            tail.setNext(novo);
            tail = novo;
        }
        tamanho++;
    }

    public void removeFirst() {
        if (head == null) {
            throw new EmptyLinkedList();
        }
        head = head.getNext();
        tamanho--;
        if (head == null) {
            tail = null;
        }
    }

    public String toString() {
        String resultado = "[";
        Node atual = head;
        while (atual != null) {
            resultado += atual.getElement();
            if (atual.getNext() != null) {
                resultado += ", ";
            }
            atual = atual.getNext();
        }
        resultado += "]";
        return resultado;
    }
}