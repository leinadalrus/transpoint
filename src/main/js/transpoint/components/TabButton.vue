<script setup lang="ts">
import HeroIcon from './HeroIcon.vue'
</script>

<template>
    <button tab="beydex" href="/tabs/homeTab">
        <HeroIcon icon="shapesSharp" />
        <label for=""> BeyDex </label>
    </button>
    <button tab="tab2" href="/tabs/dashboardTab">
        <HeroIcon icon="desktopOutline" />
        <label>Messages</label>
    </button>
    <button tab="tab2" href="/tabs/messagesTab">
        <HeroIcon icon="square" />
        <label>Messages</label>
    </button>
</template>
