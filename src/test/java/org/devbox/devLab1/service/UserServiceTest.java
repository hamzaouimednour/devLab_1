package org.devbox.devLab1.service;

import org.devbox.devLab1.model.User;
import org.devbox.devLab1.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testGetAllUsers() {
        // Mocking data
        List<User> mockUsers = Arrays.asList(new User(1L, "user1"), new User(2L, "user2"));
        Mockito.when(userRepository.findAll()).thenReturn(mockUsers);

        // Test the service method
        List<User> result = userService.getAllUsers();

        // Assertions
        assertEquals(2, result.size());
        assertEquals("user1", result.get(0).getUsername());
        assertEquals("user2", result.get(1).getUsername());
    }

    // Other test methods
}
