package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import datamodel.Item;
import datamodel.TodoList;
import datamodel.User;

@Mapper
public interface DatabaseMapper {
    void insertOrUpdateUser(@Param("user") User user);
    void insertOrUpdateList(@Param("todoList") TodoList todoList);
    void insertOrUpdateItem(@Param("item") Item item);
    User findUserById(@Param("id") Long  id);
    User findUserByName(@Param("username") String username);
    TodoList findListById(@Param("id") Long  id);
    Item findItemById(@Param("id") Long  id);
    List<Item> findItemsForList(@Param("listId") Long listId);
    List<TodoList> findListsByUserId(@Param("userId") Long userId);
    List<Item> findItemsForLists(@Param("listIds")List<Long> listIds);
    void deleteAllUsers();
    void deleteAllLists();
    void deleteAllItems();
    void deleteUserById(@Param("id")Long id);
    void deleteListById(@Param("id")Long id);
    void deleteItemById(@Param("id")Long id);
    void deleteItemsForList(@Param("listId")Long listId);
    void deleteListsForUser(@Param("userId") Long userId);
    void deleteItemsForLists(@Param("listIds")List<Long> listIds);
}