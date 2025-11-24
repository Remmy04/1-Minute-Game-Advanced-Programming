# ⏱️ 1 Minute – Pandemic Lockdown Survival Game

**1 Minute** is a Java survival–strategy game developed for the **Advanced Programming (ITS66704)** module at Taylor’s University.  
The game simulates a family’s struggle to survive a 30-day COVID-19 lockdown in Malaysia, focusing on **resource management, decision-making, and public-health awareness**. 

---

## 📚 Project Background

The project was designed to combine **advanced object-oriented programming** with an **educational, real-world theme**:

- Raise awareness about the **impact of the COVID-19 pandemic** on daily life.
- Let players experiment with **policy-like decisions** (rationing, scavenging, trading, risk-taking).
- Strengthen our understanding of **game design**, **JavaFX UI**, and **multi-class system architecture**.

The assignment was split into **Part A (Analysis & Design)** and **Part B (Development)** with full documentation, UML diagrams, and UI mock-ups.

---

## 🕹️ Game Overview

In *1 Minute*, the player controls the Lim family during a strict lockdown:

- 🛒 **Scavenging Phase (60 seconds)** – Sprint through a grocery store to collect food, water, medicine and other supplies before lockdown begins (inventory cap: 100 units). 
- 🏠 **Survival Phase (30 days)** – Manage hunger, thirst, health and morale for each family member using the collected items.
- 📖 **Daily Events & Journal** – Each in-game day triggers events (trades, scavenging missions, visitors at the door, etc.) with consequences logged in a journal. 
- ✅ **Win** by keeping the family alive until the vaccine arrives;  
  ❌ **Lose** if too many family members die due to poor resource or health management.

The design emphasises **urgency, realism, survival strategy, and replayability** through randomised events and outcomes.

---

## 🛠️ Tech & Tools

- **Language:** Java (JDK 17+)
- **Paradigm:** Advanced Object-Oriented Programming  
  - Abstraction, inheritance, polymorphism  
  - Composition and multi-class collaboration
- **Core Architecture:**
  - `Player`, `FamilyMember`, `Inventory`, `Item` models
  - Abstract `Event` class with concrete event types (`YesNoEvent`, `SendSomeoneEvent`, `TradeEvent`, etc.)
  - `Outcome` class to apply hunger / thirst / health / morale changes
  - `Game` controller handling day cycle, win/lose logic and event processing
- **UI & Game Engine:**
  - JavaFX (scene management, buttons, HUD / journal views)
  - Custom pixel-art UI for scenes (shopping, living room, journal, win/lose screens)
- **Design & Assets Tools:**
  - Figma – screen layout and prototypes  
  - Procreate – concept art & sketches  
  - Pixel Studio – final pixel sprites and UI elements

---

## 👨‍💻 My Contributions

As part of a 5-member team, my responsibilities included:

- Designing and implementing key **game logic**:
  - Day-by-day cycle (status updates, events, win/lose checks)
  - Resource consumption and rationing behaviour
- Working on the **data model**:
  - Class design for `Player`, `FamilyMember`, `Inventory`, `Item`, `Event` and `Outcome`
- Helping produce **UML diagrams** and **technical documentation** (use case diagrams, class diagrams, data attributes & methods).
- Assisting with **JavaFX integration** between UI screens (start, shopping, living room, journal, end screens) and the underlying game state. 

---

## 🧠 Skills Demonstrated

- Advanced **Java OOP** (inheritance hierarchies, abstract classes, encapsulation)
- **Game state management** and turn-based logic
- **Resource management & simulation modelling** (hunger, thirst, health, morale bars)
- **JavaFX GUI development** and scene transitions
- Working with **collections** (`List`, custom item collections) and custom model classes
- Reading & designing **UML use case and class diagrams**
- Writing **structured technical reports** and documenting system behaviour

---

Thanks for checking out **1 Minute**!  
Feel free to explore the source code, reports in `/docs`, and assets in `/assets` once everything is uploaded. 🎮
