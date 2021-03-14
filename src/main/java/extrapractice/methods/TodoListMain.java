package extrapractice.methods;

import java.util.Arrays;

public class TodoListMain {

    public static void main(String[] args) {

        Todo todo = new Todo("mosogatás");

//        System.out.println(todo.getCaption());
//        System.out.println(todo.isFinished());
//        todo.finish();
//        System.out.println(todo.isFinished());
//
        TodoList todoList = new TodoList();
        todoList.addTodo("bevásárlás");
        todoList.addTodo("porszívózás");
        todoList.addTodo("vasalás");
        todoList.addTodo("mosás");
        todoList.addTodo("portörlés");
        System.out.println(todoList);

        todoList.finishTodos("porszívózás");
        todoList.finishTodos("portörlés");
        System.out.println(todoList);

        todoList.finishAllTodos(Arrays.asList("bevásárlás", "vasalás"));
        System.out.println(todoList);

        System.out.println(todoList.todosToFinish());
        System.out.println(todoList.numberOfFinishedTodos());

    }
}
