package pro.sky.java.course2.lesson1;

import pro.sky.java.course2.lesson1.Exceptions.DiagnosticFailedException;
import pro.sky.java.course2.lesson1.Transport.Bus;
import pro.sky.java.course2.lesson1.Transport.Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class Station {
    private final Queue<Transport<?>> transportQueue = new ArrayDeque<>();
    public void addTransport(Transport<?> transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в техобслуживании");
        } else {
            transportQueue.add(transport);
        }
    }
    public void service()  {
        Transport<?> transport = transportQueue.poll();
        if (transport != null) {

            transport.getMechanics().get(0).maintenance();

        }

    }//



}
