package exam03retake02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TodoList {

    private List<Todo> todoList = new ArrayList<>();


    public int getNumberOfItemsLeft() {
        int count = 0;

        for (Todo todo : todoList) {
            if (todo.getState() == State.NON_COMPLETED) {
                count++;
            }
        }
        return count;
    }

    public List<String> getMostImportantTodosText() {
        List<String> mostImportant = new ArrayList<>();
        for (Todo todo : todoList) {
            Collections.sort(todoList, new Comparator<Todo>() {
                @Override
                public int compare(Todo o1, Todo o2) {
                    return o1.getPriority().compareTo(o2.getPriority());
                }

            }

        }
        return mostImportant;
    }

    public void deleteCompleted() {
        for (Todo todo : todoList) {
            if (todo.getState().equals(State.COMPLETED)) {
                todoList.remove(todo);
            }
        }

    }


    public List<Todo> getTodos() {
        return new ArrayList<>(todoList);
    }
}
