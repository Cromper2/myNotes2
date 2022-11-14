package pl.slowacki.my_notes.controler;

import org.springframework.web.bind.annotation.*;
import pl.slowacki.my_notes.model.User;

import java.util.HashMap;
import java.util.Map;

@RestController
public class javamycontoller
{
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World!";
    }

    @GetMapping("/greetings/{name}")
    public String greetigs(@PathVariable String name)
    {
        return "Greetings " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age)
    {
        return "Hello " + name + ". Your age is " + age;
    }

    @GetMapping("/userGreetings")
    public String userGreeting(User user){
        return "Hello " + user.getName() + " you're amazing! :D";
    }

    @PostMapping("/userGreetings")
    public String userGreetingPost(@RequestBody User user){
        return "Hello " + user.getName() + " you're amazing! :D";
}
    public Map<String, User> users = new HashMap<>();

    @PostMapping("/users")
    public String addUser(@RequestBody User user)
    {
        users.put(user.getLogin(), user);
        return "ok";
    }

    @GetMapping("/users")
    public Map getUsers(@RequestBody User user)
    {
        return users;
    }

    @DeleteMapping("/users/{login}")
    public String deleteUser(@PathVariable String login)
    {
        users.remove(login);
        return "Removed user";
    }

}
