# Sur — Offline-first Music Player

An Android music player written in **Java**, for the CSE 2200 sessional
project. It will play the songs already on the phone with no internet, and
later add live internet radio and podcast shows.

Built with Android Studio Dolphin 2021.3.1 (AGP 7.3.1, compileSdk 33,
minSdk 24), run on a real phone rather than the emulator.

---

## Where it is now

The project is set up and the data model is in place. The app builds and
installs, but it does not play anything yet.

Done:

- [x] Gradle project configured for Dolphin / API 33
- [x] Theme, colours, light and dark variants
- [x] `MediaItem` — abstract base class, title shared by everything playable
- [x] `Playable` — interface the playback service will depend on
- [x] `Song` — a Room `@Entity`, extends `MediaItem`, implements `Playable`
- [x] `TimeUtil` — milliseconds to `3:07`
- [x] One screen, using view binding

Next:

- [ ] Room database, DAO, and a repository
- [ ] Scan the phone's audio with `MediaStore`
- [ ] Library screen with a `RecyclerView`, search and favourites
- [ ] Playlists — create, rename, delete, add and remove songs
- [ ] Playback with ExoPlayer in a foreground service
- [ ] Notification and lock-screen controls
- [ ] Full-screen player with a seek bar
- [ ] Live radio and podcasts over the network

---

## Run it

1. **Android Studio → Open** → choose this folder (the one with `settings.gradle`).
2. Let Gradle sync. The first sync downloads Gradle and the libraries.
3. Plug in a real phone and press Run.

## Design notes

`MediaItem` is abstract because a bare media item is never a real thing in
this app, and because it forces every subclass to answer `getKey()` and
`getSubtitle()` in its own way.

`Playable` exists so the playback service never has to ask what kind of
thing it is holding — a local song, a radio station and a podcast episode
all answer the same three questions.
