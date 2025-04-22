<script setup lang="ts">
import { ref } from 'vue'
import { useStoreGallery } from '@/composables/useStoreGallery'
import TradingCard from './TradingCard.vue'
import type { IBeyInfo } from '@/models/IBeyInfo'

const beywatches = ref<IBeyInfo[]>([])
</script>

<template>
    <section>
        <article>
            <div>
                <li v-for="bey in beywatches" :key="bey.id">
                    <TradingCard @vue:mounted="useStoreGallery()"></TradingCard>
                    <img :src="bey.webviewPath" />
                </li>
            </div>
        </article>
    </section>
</template>
