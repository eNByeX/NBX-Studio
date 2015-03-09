package com.github.enbyex.nbx.studio.api;

/**
 * @author soniex2
 */
public interface ISoundAdapter {
    /**
     * Get the sound name equivalent to Minecraft's "minecraft:note.bd".
     *
     * @return A sound name that can be passed to {@link #getSound(String name)} to retrieve the sound.
     */
    String getBassDrumSoundName();

    /**
     * Get the sound name equivalent to Minecraft's "minecraft:note.bassattack".
     *
     * @return A sound name that can be passed to {@link #getSound(String name)} to retrieve the sound.
     */
    String getBassGuitarSoundName();

    /**
     * Get the sound name equivalent to Minecraft's "minecraft:note.hat".
     *
     * @return A sound name that can be passed to {@link #getSound(String name)} to retrieve the sound.
     */
    String getClicksSoundName();

    /**
     * Get the sound name equivalent to Minecraft's "minecraft:note.harp".
     *
     * @return A sound name that can be passed to {@link #getSound(String name)} to retrieve the sound.
     */
    String getPianoSoundName();

    /**
     * Get the sound name equivalent to Minecraft's "minecraft:note.snare".
     *
     * @return A sound name that can be passed to {@link #getSound(String name)} to retrieve the sound.
     */
    String getSnareSoundName();

    /**
     * Get the {@link ISound} that corresponds to the given name.
     *
     * @param name The name used to lookup the {@link ISound}.
     * @return An {@link ISound} that corresponds to the given name.
     */
    ISound getSound(String name);
}