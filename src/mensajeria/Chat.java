package mensajeria;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<String> mensajes;
    private List<ChatListener> listeners;

    public Chat() {
        mensajes = new ArrayList<>();
        listeners = new ArrayList<>();
    }

    public synchronized void enviarMensaje(String mensaje) {
        mensajes.add(mensaje);
        notificarListeners();
    }

    public synchronized String obtenerMensajes() {
        StringBuilder sb = new StringBuilder();
        for (String mensaje : mensajes) {
            sb.append(mensaje).append("\n");
        }
        return sb.toString();
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
}
