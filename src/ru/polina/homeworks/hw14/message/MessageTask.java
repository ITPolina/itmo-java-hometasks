package ru.polina.homeworks.hw14.message;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        int[] typeCounts = new int[MessagePriority.values().length];
        for (Message message : messageList) {
            typeCounts[message.getPriority().ordinal()]++;

            /*for (int i = 0; i < MessagePriority.values().length; i++) {
                if (message.getPriority() == MessagePriority.getPriority(i)) {
                    typeCounts[i]++;
                }

            }*/
        }
        for (int i = 0; i < typeCounts.length; i++) {
            System.out.println("Количество писем с приоритетом " + MessagePriority.getPriority(i) + "-" + typeCounts[i] + "шт." );
        }

    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        int[] codeCounts = new int[10];
        for (Message message : messageList) {
            codeCounts[message.getCode()]++;
        }
        for (int i = 0; i < codeCounts.length; i++) {
            System.out.println("Количество писем с кодом " + i + "-" + codeCounts[i] + "шт." );
        }


    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        LinkedHashSet<Message> messageLinkedHashSet = new LinkedHashSet<>(messageList);
        System.out.println("Количество уникальных сообщений: " + messageLinkedHashSet.size());


    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        LinkedHashSet<Message> messageLinkedHashSet = new LinkedHashSet<>(messageList); //- можно ли так?
        messageList.retainAll(messageLinkedHashSet);
        return messageList; // -?????
        //return null;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println(messageList);
        Iterator<Message> iterator = messageList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getPriority() == priority) {
                iterator.remove();
            }
        }
        System.out.println(messageList);
    }


    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println(messageList);
        Iterator<Message> iterator = messageList.iterator();
        while (iterator.hasNext() ) {
            if (iterator.next().getPriority() != priority) {
                iterator.remove();
            }
        }
        System.out.println(messageList);
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        System.out.println(messages);

        countEachPriority(messages);

        countEachCode(messages);

        //removeEach(messages, MessagePriority.LOW);

        //removeOther(messages, MessagePriority.URGENT);

        uniqueMessagesInOriginalOrder(messages);


    }
}
