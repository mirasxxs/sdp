// Button interface
interface Button {
    void render();
}

// Window interface
interface Window {
    void display();
}

// WindowsButton class
class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering Windows button.");
    }
}

// MacButton class
class MacButton implements Button {
    public void render() {
        System.out.println("Rendering Mac button.");
    }
}

// WindowsWindow class
class WindowsWindow implements Window {
    public void display() {
        System.out.println("Displaying Windows window.");
    }
}

// MacWindow class
class MacWindow implements Window {
    public void display() {
        System.out.println("Displaying Mac window.");
    }
}

// AbstractFactory interface
interface GUIFactory {
    Button createButton();
    Window createWindow();
}

// WindowsFactory class
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Window createWindow() {
        return new WindowsWindow();
    }
}

// MacFactory class
class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Window createWindow() {
        return new MacWindow();
    }
}

// Test class
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Window windowsWindow = windowsFactory.createWindow();
        windowsButton.render();
        windowsWindow.display();

        GUIFactory macFactory = new MacFactory();
        Button macButton = macFactory.createButton();
        Window macWindow = macFactory.createWindow();
        macButton.render();
        macWindow.display();
    }
}
