package mensajeria;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<Mensaje> mensajes;
    private List<ChatListener> listeners;

    public Chat() {
        mensajes = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    public synchronized void enviarMensaje(String contenido, String remitente) {
        Mensaje mensaje = new Mensaje(contenido, remitente);
        mensajes.add(mensaje);
        notificarListeners();
    }

    public synchronized List<Mensaje> getMensajes() {
        return mensajes;
    }

    public synchronized void agregarListener(ChatListener listener) {
        listeners.add(listener);
    }

    public synchronized void eliminarListener(ChatListener listener) {
        listeners.remove(listener);
    }

    private void notificarListeners() {
        for (ChatListener listener : listeners) {
            listener.mensajeEnviado();
        }
    }

    public interface ChatListener {
        void mensajeEnviado();
    }
    
    public synchronized String obtenerMensajes() {
        StringBuilder sb = new StringBuilder();
        for (Mensaje mensaje : mensajes) {
            sb.append(mensaje).append("\n");
        }
        return sb.toString();
    }
}
