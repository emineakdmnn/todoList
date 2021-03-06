package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import datamodel.Item;
import datamodel.TodoList;

import static security.PasswordUtil.*;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;

public interface RestService {

    public Response echo();

    public Response createUser(String username, String password) throws CannotPerformOperationException, IOException;

    public Response loginUser(String username, String password) throws InvalidHashException, CannotPerformOperationException, IOException;

    public Response logoutUser(Long userId) throws IOException;

    public Response updateUsername(String username, Long id) throws IOException;

    public Response updatePassword(String oldPassword, String newPassword, Long id) throws IOException, InvalidHashException, CannotPerformOperationException;

    public Response findUser(String username) throws IOException;

    public Response createOrEditList(TodoList list) throws IOException;

    public Response getListsByUser(Long userId);

    public Response createOrEditItem(Item item) throws IOException;

    public Response getItemsForList(Long listId);

    public Response getItemsForLists(List<Long> listIds);

    public Response deleteUser(Long id);

    public Response deleteItem(Long id);

    public Response clearList(Long listId);

    public Response deleteList(Long id);

    public Response deleteListsForUser(Long id);

}