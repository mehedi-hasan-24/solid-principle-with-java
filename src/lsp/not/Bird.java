package lsp.not;
// https://tusharghosh09006.medium.com/liskov-substitution-principle-lsp-744eceb29e8#:~:text=The%20Liskov%20Substitution%20Principle%20(LSP,the%20correctness%20of%20the%20program.
interface Bird {
    public void fly();

    public void walk();
}

/* A Happy Class*/
class Parrot implements Bird {
    public void fly() { /* logic */}

    public void walk() { /* logic */ }
}

// it's break the principle of LSP. Penguin can not fly.
class Penguin implements Bird {
    public void fly() { /* logic */ }

    public void walk() {/* logic */ }
}