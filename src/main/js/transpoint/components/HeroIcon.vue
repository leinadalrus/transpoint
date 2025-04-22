<script setup lang="ts">
defineProps({
    icon: {
        type: String,
        required: true
    }
})
</script>

<template>
    <img :src="icon" alt="">
</template>