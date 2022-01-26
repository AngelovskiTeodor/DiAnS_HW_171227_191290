import { configureStore } from '@reduxjs/toolkit'
import coordinatesReducer from '../features/coordinates/coordinatesSlice'

export default configureStore({
  reducer: {
      coordinates: coordinatesReducer,
  },
})