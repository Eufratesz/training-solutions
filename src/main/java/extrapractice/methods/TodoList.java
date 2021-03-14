package extrapractice.methods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo>todoList = new ArrayList<>();

    public void addTodo(String caption){
        todoList.add(new Todo(caption));

    }

    public void finishTodos(String caption){
        for(Todo todo : todoList) {
            if (todo.getCaption().equals(caption)){
                todo.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish){
        for(String todoToFinish : todosToFinish){
            finishTodos(todoToFinish);
        }
    }

    public List<String> todosToFinish(){
        List<String> todosToFinish = new ArrayList<>();
        for(Todo todo: todoList) {
            if(!todo.isFinished()) {
                todosToFinish.add(todo.getCaption());
            }
        }
        return todosToFinish;
    }

    public int numberOfFinishedTodos(){
        int count = 0;
        for(Todo todo : todoList){
            if(todo.isFinished()){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return todoList.toString();
    }
}
