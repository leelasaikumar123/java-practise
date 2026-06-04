# AI Agent Instructions for java-practise

## Purpose
Help an AI agent quickly work with this repository of Java practice exercises and small projects.

## What this repository contains
- Java practice programs organized by day directories: `day01`, `day02`, `day03`, `day05`, `day06`, `day16day17`, `day19`, `day20`, `day21`, `day23`, `day24`, `day26`, `employee`, `linecomparision`.
- Most files are single-class Java programs meant to be compiled and run directly.
- Some folders use Java packages and nested directory layouts.
- There is no build system like Maven or Gradle at the repository root.

## Build / run guidance
- Prefer direct `javac` / `java` commands.
- Compile from the repository root when packages are declared.
- Example for a package-based file:
  - `javac day05/Distance.java`
  - `java day05.Distance`
- Example for a simple class with no explicit package:
  - `javac day26/HotelReservation.java`
  - `java HotelReservation`
- For subprojects under `day20`, `day21`, and `day23`, treat each project root separately. Example:
  - `cd day20/UserValidationProject`
  - `javac -d bin src/com/uservalidation/*.java`
  - `java -cp bin com.uservalidation.UserValidation`

## Code conventions
- Do not rename files or classes arbitrarily; file names generally match the public class name.
- Preserve declared package paths when moving or compiling code.
- Focus on small, self-contained fixes and exercises rather than wholesale architectural changes.
- Keep changes aligned with practice-style Java code (console output and basic input handling).

## When asked for quick suggestions
- Give concise Java-focused edits or refactors.
- Prefer minimal updates to existing class logic.
- Use the exact source location and package path when suggesting compile/run commands.
- Mention if a file is part of a package and requires `java package.Name` rather than `java FileName`.

## Useful notes for the agent
- There is no top-level `pom.xml`, `build.gradle`, or `package.json`.
- Some directories under `day20`, `day21`, and `day23` use a `src`/`test` structure with package namespaces.
- This repository is best treated as a set of independent Java exercises, not a monolithic application.
