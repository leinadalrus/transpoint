<script setup lang="ts">
import type { IBeyInfo } from '@/models/IBeyInfo'

const beys = ref<IBeyInfo[]>([])
</script>

<template>
    <article>
        <li v-for="beyBlades in beys" :key="beyBlades.id">
            {{ beyBlades }}
        </li>
    </article>
</template>
