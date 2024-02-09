# DSA-wk2-queue2

# BookingSystem Class

The `BookingSystem` class represents a booking system that manages a list of `TicketHolder` objects. It implements the `QueueInterface` interface.

## Fields

- `input`: A `Scanner` object for user input.
- `bList`: A private and final `ArrayList` to store instances of `TicketHolder`.

## Constructor

- `BookingSystem()`: Initializes the `bList` with an empty `ArrayList` in the constructor.

## Methods

### `isEmpty()`

- Checks if the `bList` is empty and prints a corresponding message.
- Returns `true` if the list is empty; otherwise, returns `false`.

### `size()`

- Prints the size of the `bList`.
- Returns the size of the `bList`.

### `enqueue()`

- Takes user input to create a new `TicketHolder` object and adds it to the `bList`.
- Prints a success message after adding the object.

### `dequeue()`

- Checks if the `bList` is empty and prints a message if it is.
- Removes the first element from the `bList` if not empty.
- Prints a success message after removal.

### `display()`

- Iterates through the `bList` using an `Iterator`.
- If the list is empty, it prints a corresponding message.
- Calls the `toString` method of each `TicketHolder` object in the list and concatenates the result to a string.
- Prints the concatenated string for each element.

## Class Diagram 

![Class Diagram ScreenShot](https://github.com/EskandarAtrakchi/DSA-wk2-queue2/blob/master/class%20diagram%20lucidchart.png?raw=true)

## Summary

The `BookingSystem` class provides functionality to manage and display information about ticket holders. It utilizes a list of `TicketHolder` objects to store ticket details and implements common queue operations.