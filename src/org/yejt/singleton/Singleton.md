# Singleton

## Type: Creational Pattern

### Structure:
<img src="./Singleton.jpg"/>

### Key points
- Make constructor **not public**
- Add **a static & private/protected** field which means the only
instance itself
- Add **a static method** that **return the only instance**, if the instance is
not null, just return it, or create a new instance

To create just only a single instance for the whole program,
use Singleton is feasible and helpful to save resources.